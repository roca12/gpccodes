import java.util.*
fun main(args: Array<String>) {
    val size=101
    var G= Array(size,{IntArray(size)})
    for(i in 0..G.size-1){
        var colArray=IntArray(size);
        for(j in 0..G.size-1){
            colArray[j]=0
        }
        G[i]=colArray
    }
    val sc=Scanner(System.`in`)
    var V=sc.nextInt()
    val E=sc.nextInt()
    for(i in 0..E-1){
        var desde=sc.nextInt()
        var hasta=sc.nextInt()
        var peso=sc.nextInt()
        G[desde][hasta]=peso
        G[hasta][desde]=peso
    }
    for(i in 0..V-1){
        for(j in 0..V-1){
            print("${G[i][j]}\t")
        }
        print("\n")
    }
}
