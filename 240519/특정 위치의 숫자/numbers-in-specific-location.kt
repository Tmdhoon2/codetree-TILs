import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val input = readLine().split(" ").map{ it.toInt() }

    bw.write(input[2].plus(input[4]).plus(input[9]).toString())

    bw.flush()
    bw.close()
}