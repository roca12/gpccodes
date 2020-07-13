
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class trieNode {

        private final int SIZE = 4;
        trieNode padre;
        trieNode fallo;
        trieNode[] hijos;
        char c;
        trieNode next;
        boolean isEnd;

        public trieNode() {
            hijos = new trieNode[SIZE];
        }

        public trieNode(char c) {
            this();
            this.c = c;
        }

        trieNode hijo(char ch) {
            trieNode nodo = hijos[ch % SIZE];
            if (nodo == null) {
                return null;
            } else {
                while (nodo.next != null) {
                    if (nodo.c == ch) {
                        return nodo;
                    }
                    nodo = nodo.next;
                }
                if (nodo.c == ch) {
                    return nodo;
                }
                return null;
            }
        }

        void addWord(String word) {
            char firstchar = word.charAt(0);
            trieNode hijo = hijo(firstchar);
            if (hijo == null) {
                hijo = new trieNode(firstchar);
                hijo.padre = this;
                int pos = firstchar % SIZE;
                if (hijos[pos] == null) {
                    hijos[pos] = hijo;
                } else {
                    trieNode nodo = hijos[pos];
                    while (nodo.next != null) {
                        nodo = nodo.next;
                    }
                    nodo.next = hijo;
                }
            }
            if (word.length() > 1) {
                hijo.addWord(word.substring(1));
            } else {
                hijo.isEnd = true;
            }
        }

        boolean contains(String word) {
            if (word.length() == 0) {
                return isEnd;
            } else {
                trieNode nodo = hijo(word.charAt(0));
                if (nodo == null) {
                    return false;
                } else {
                    return nodo.contains(word.substring(1));
                }
            }
        }

        void constructFallLinks() {
            trieNode root = this;
            root.fallo = root;
            //BFS
            Queue<trieNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                trieNode currentnode = queue.poll();
                for (int i = 0; i < SIZE; i++) {
                    trieNode nodo = currentnode.hijos[i];
                    if (nodo != null) {
                        while (nodo.next != null) {
                            queue.add(nodo);
                            nodo = nodo.next;
                        }
                        queue.add(nodo);
                    }
                }
                if (currentnode != root) {
                    trieNode f = currentnode.padre.fallo;
                    while (f.hijo(currentnode.c) != null && f != root) {
                        f = f.fallo;
                    }
                    currentnode.fallo = f.hijo(currentnode.c);
                    if (currentnode.fallo == null) {
                        currentnode.fallo = root;
                    }
                    if (currentnode.fallo == currentnode) {
                        currentnode.fallo = root;
                    }
                }
            }
        }

        void search(String text) {
            trieNode root = this;
            trieNode currentnode = root;
            trieNode node;
            trieNode n;
            char[] chars = text.toCharArray();
            for (char ch : chars) {
                node = currentnode;
                while (node.hijo(ch) == null && node != root) {
                    node = node.fallo;
                }
                if (node == root) {
                    node = node.hijo(ch);
                    if (node == null) {
                        node = root;
                    }
                } else {
                    node = node.hijo(ch);
                }
                n = node;
                while (n != root) {
                    if (n.isEnd) {
                        System.out.println("encontrada palabra que termina en " + n.c);
                    }
                    n = n.fallo;
                }
                currentnode = node;
            }
        }
    }

    public static void main(String[] args) {
        trieNode trie= new trieNode();
        trie.addWord("Cepeda");
        trie.addWord("chupa");
        trie.addWord("lo");
        trie.constructFallLinks();
        trie.search("Cepeda lo chup");
    }
}
