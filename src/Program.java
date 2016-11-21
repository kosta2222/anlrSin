import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
 class Program
{
        public static void main (String[] args)
        {

//String input = "public static void main(String[] args) { }";
InputStream is=System.in;
Reader r=new InputStreamReader(is);

String st="";
 System.out.println("REPL input:");
while(!st.equals("q")){
    try{
 BufferedReader br=new BufferedReader(r);
 st=br.readLine();
}catch(Exception e)
      {
         System.out.println("Error: "+e);
      }
CharStream cs = new ANTLRInputStream(st);
      sinLexer lexer = new sinLexer(cs);
      
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      sinParser parser = new sinParser(tokens);
      if(!st.equals("q")){
ParseTree tree = parser.input(); // begin parsing at init rule
// print LISP-style tree
System.out.println(tree.toStringTree(parser));

sinBaseVisitorImpl visitor = new sinBaseVisitorImpl();
        
        
        Double result = visitor.visit(tree);
        System.out.println("Result: " + result);
 
 }
}      
 }
 }

 