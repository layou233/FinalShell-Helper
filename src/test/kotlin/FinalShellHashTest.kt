import com.plaxz.FinalShellHash

fun main() {
    println("输入机器码：")
    val hwid = readLine()
    println("高级版：" + FinalShellHash.transform("61305${hwid}8552"))
    println("专业版：" + FinalShellHash.transform("2356${hwid}13593"))
}