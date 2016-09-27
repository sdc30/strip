import java.io._
import scala.io.Source

object strip {

	val file1 = "/Users/ranger/Desktop/smsbackup/test.xml"
	val file2 = "/Users/ranger/Desktop/smsbackup/sms-20150213154059.xml"	
	val pw = new PrintWriter(new File(file1))
	
	def writeR (u: String) = {
		val nu = u.replaceAll("[^\\x20-\\x7e]", " ")
		pw.write(nu)
		pw.write("\n")
	}

	val readWrite = Source.fromFile(file2).getLines().foreach { line => writeR(line) }
}