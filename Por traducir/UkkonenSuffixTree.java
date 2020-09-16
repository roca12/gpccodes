


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UkkonenSuffixTree {

    static class Ukkonen {

        // set to true if each step should be printed out and detail about 
        // active node should be printed. Increases runtime to O(n^2).
        public boolean DETAILED = true;
        // Unique ending character appended to end of string 
        // to ensure suffix tree is not implicit.
        public char UNIQUE = '$';
        // String given (if running offline)
        private String phrase;
        // Root of the suffix tree.
        private Node root;
        // Global variable to maintain constant time extension of suffixes.
        private int leafEnd;
        // Holds internal node whose suffix link remains to be set/finalized.
        private Node internalNode;
        // Active Point Variables
        // Can be root or internal node.
        private Node activeNode;
        // Holds the index the edge we should traverse next starts with.
        private int activeEdge;
        // Tells how many characters we need to walk down.
        private int activeLength;
        // Number of explicit extensions that need to be made for this phase.
        private int remainingSuffixCount;

        public Ukkonen() {
            root = new Node(-1);
            leafEnd = -1;
            activeNode = root;
            activeEdge = -1;
            activeLength = 0;
            remainingSuffixCount = 0;
        }

        public void process(String str) {
            if (str.indexOf(UNIQUE) != str.length() - 1) {
                throw new IllegalArgumentException("String must end in the unique character $");
            }
            phrase = str;
            for (int i = 0; i < phrase.length(); i++) {
                if (DETAILED) {
                    System.out.println("----------Step " + (i + 1) + "-------------");
                }
                processIndex(i);
                if (DETAILED) {
                    printTree();
                }
            }
            if (!DETAILED) {
                printTree();
            }
        }

        // Used when running offline
        private void processIndex(int index) {
            // Rule One: if leaf, append latest character.
            // Trick Three: Update end value of all leaf edges by updating
            // the global end variable.
            if (DETAILED) {
                System.out.println("Rule One/Trick Three");
            }
            leafEnd = index;
            remainingSuffixCount++;
            internalNode = null;
            while (remainingSuffixCount > 0) {
                // ALZ: ActivePoint Change for Active Length Zero
                // At the start of extension, when activeLength is zero, activeEdge 
                // is set to the current character being processed
                if (activeLength == 0) {
                    if (DETAILED) {
                        System.out.println("ALZ");
                    }
                    activeEdge = index;
                    if (DETAILED) {
                        printActivePoint();
                    }
                }

                if (!activeNode.edgeMap.containsKey(phrase.charAt(activeEdge))) {
                    // Rule Two: Creates a new leaf edge if not seen before
                    if (DETAILED) {
                        System.out.println("Rule Two: new leaf");
                    }
                    activeNode.edgeMap.put(phrase.charAt(activeEdge), new Node(index));

                    if (internalNode != null) {
                        if (DETAILED) {
                            System.out.println("Set up suffixLink from last internal node to activeNode");
                        }
                        internalNode.suffixLink = activeNode;
                        internalNode = null;
                    }

                } else {

                    Node next = activeNode.edgeMap.get(phrase.charAt(activeEdge));

                    // Trick One: Skip/Count. Using ActivePoint to save time on the
                    // walk down. 
                    if (DETAILED) {
                        System.out.println("Trick One: Skip/Count");
                    }
                    if (walkedDown(next)) {
                        continue;
                    }

                    // Rule Three: ends the current phase (when current character is 
                    // found in current edge being traversed)
                    if (phrase.charAt(next.start + activeLength) == phrase.charAt(index)) {
                        if (DETAILED) {
                            System.out.println("Rule Three");
                        }
                        if (internalNode != null && activeNode != root) {
                            // if (DETAILED) System.out.println("Set up suffixLink from last internal node to previous internal node");
                            internalNode.suffixLink = activeNode;
                            internalNode = null;
                        }

                        // ER3: ActivePoint Change For Extension Rule 3
                        if (DETAILED) {
                            System.out.println("ER3");
                        }
                        activeLength++;
                        if (DETAILED) {
                            printActivePoint();
                        }

                        // Trick Two: Stop the processing of any phase as soon as rule 3 applies. 
                        // All further extensions are already present in tree implicitly. 
                        if (DETAILED) {
                            System.out.println("Trick Two");
                        }
                        break;
                    }

                    // Rule Two: suffix only partially matches edge. Inner edge must be created.
                    if (DETAILED) {
                        System.out.println("Rule Two: Split Node");
                    }
                    int splitEnd = next.start + activeLength - 1;
                    Node split = new Node(next.start, splitEnd);
                    // replace existing pointer to new inner node.
                    activeNode.edgeMap.put(phrase.charAt(activeEdge), split);
                    // add new leaf edge
                    split.edgeMap.put(phrase.charAt(index), new Node(index));
                    // move old leaf node to be below new inner node.
                    next.start += activeLength;
                    // add leaf node as a child of the created inner node.
                    split.edgeMap.put(phrase.charAt(next.start), next);

                    if (internalNode != null) {
                        if (DETAILED) {
                            System.out.println("Set up suffixLink from last internal node to this newly created one");
                        }
                        internalNode.suffixLink = split;
                    }
                    internalNode = split;
                }

                remainingSuffixCount--;

                // ER2C1: ActivePoint Change For Extension Rule 2 Change 1
                if (activeNode == root && activeLength > 0) {
                    if (DETAILED) {
                        System.out.println("ER2C1");
                    }
                    activeLength--;
                    activeEdge = index - remainingSuffixCount + 1;
                    if (DETAILED) {
                        printActivePoint();
                    }
                } else if (activeNode != root) { // ER2C2
                    if (DETAILED) {
                        System.out.println("ER2C2");
                    }
                    activeNode = activeNode.suffixLink;
                    if (DETAILED) {
                        printActivePoint();
                    }
                }
            }
        }

        // If activeLength < edgeLength, no walk down needed.
        private boolean walkedDown(Node n) {
            // WD: ActivePoint Change For Walk Down
            // Transform ActivePoint variables to synonymous ActivePoint of 
            // smaller length while walking down the tree. Such as from root node
            // to inner node.
            if (activeLength >= edgeLength(n)) {
                if (DETAILED) {
                    System.out.println("WD");
                }
                activeNode = n;
                activeEdge += edgeLength(n);
                activeLength -= edgeLength(n);
                if (DETAILED) {
                    printActivePoint();
                }
                return true;
            }

            return false;
        }

        private int edgeLength(Node n) {
            return n.end != -1 ? n.end - n.start + 1 : leafEnd - n.start + 1;
        }

        // Labels the edges with -1 if it's an inner node or 
        // 0...phrase.length()-1 for the leaves and prints them in DFS order.
        public void dfsSetAndPrint(Node n, int labelHeight) {
            if (n == null) {
                return;
            }
            // if it is not a root
            if (n.start != -1) {
                System.out.print(n);
            }
            boolean isLeaf = true;
            for (Entry<Character, Node> entry : n.edgeMap.entrySet()) {
                Node node = entry.getValue();
                // if n is inner node
                if (isLeaf && n.start != -1) {
                    System.out.println(" " + n.suffixIndex);
                }
                isLeaf = false;
                dfsSetAndPrint(node, labelHeight + edgeLength(node));
            }
            // if n is a leaf
            if (isLeaf) {
                n.suffixIndex = phrase.length() - labelHeight;
                System.out.println(" " + n.suffixIndex);
            }
        }

        class Node {

            // start index of substring labeling edge from parent to this.
            int start;
            // end index of substring. -1 for leaf edges as those follow leafEnd.
            int end;
            // map from first character seen in edge to the node that contains the edge.
            Map<Character, Node> edgeMap;
            // speeds up node traversal by linking to node with same edge content.
            Node suffixLink;
            // used when printing tree for clarity. -1 for inner nodes, 0...m for leaf nodes.
            int suffixIndex;

            Node(int start) {
                this.start = start;
                this.end = -1;
                edgeMap = new HashMap<>();
                suffixLink = root;
                suffixIndex = -1;
            }

            Node(int start, int end) {
                this.start = start;
                this.end = end;
                edgeMap = new HashMap<>();
                suffixLink = root;
                suffixIndex = -1;
            }

            @Override
            public String toString() {
                return end == -1 ? phrase.substring(start, leafEnd + 1) : phrase.substring(start, end + 1);
            }

        }

        private void printActivePoint() {
            StringBuilder sb = new StringBuilder();
            sb.append("ActivePoint is (");
            if (activeNode.start == -1) {
                sb.append("root, ");
            } else {
                sb.append(phrase.substring(activeNode.start, activeNode.start + 1));
                sb.append(", ");
            }
            sb.append(phrase.substring(activeEdge, activeEdge + 1));
            sb.append(", ");
            sb.append(activeLength).append(")");
            System.out.println(sb.toString());
        }

        public void printTree() {
            dfsSetAndPrint(root, 0);
            if (DETAILED) {
                printActivePoint();
            }
        }

    }

    public static void main(String[] args) {
        Ukkonen suffixTree = new Ukkonen();
        suffixTree.process("abcabxabcd$");
        // suffixTree.process("cacao$")
    }

}
