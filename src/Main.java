
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

//		System.out.println( args[0].split("\\.").length );
		String outputFile = args[0].split("\\.")[0] + ".html";
//		System.out.println( outputFile );

		Writer fileWriter = new FileWriter( outputFile );
		fileWriter.write( "<!DOCTYPE html>\n" );
		fileWriter.write( "<html>\n" );

		fileWriter.write( "<head>\n" );
		fileWriter.write( "<title>" + args[0] + "</title>\n" );
		//fileWriter.write( "<style>p.indent{ padding-left: 1.8em }</style>\n" );
		fileWriter.write( "</head>\n" );

		fileWriter.write( "<body>\n" );

		fileWriter.write( "<p>" );

		FileReader fileReader = new FileReader( args[0] );
		MyScanner yylex = new MyScanner( fileReader );
		for ( Symbol current = yylex.next(); current.tokenType != TokenType.EOF; current = yylex.next() ){
			TokenType token = current.tokenType;
			if ( token == TokenType.ENTER )
				fileWriter.write( "<br>" );
			else if ( token == TokenType.TAB )
				fileWriter.write( "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" );
				//fileWriter.write( "<span class=\"indent\"></span>" );
			else if ( token == TokenType.LESSTHAN )
				fileWriter.write( "&lt;" );
			else if ( token == TokenType.MORETHAN )
				fileWriter.write( "&gt;" );
			else if ( token == TokenType.IDENTIFIER )
				fileWriter.write( "<span style=\"color:orange\">" + current.content + "</span>" );
			else if ( token == TokenType.INTEGER )
				fileWriter.write( "<span style=\"color:violet\">" + current.content + "</span>" );
			else if ( token == TokenType.STRING )
				fileWriter.write("<span style=\"color:red\">" + current.content + "</span>");
			else if ( token == TokenType.SPECIAL_CHARACTER )
				fileWriter.write( "<span style=\"color:green\"><i>" + current.content + "</i></span>" );
			else if ( token == TokenType.COMMENT )
				fileWriter.write( "<span style=\"color:gray\">" + current.content + "</span><br>" );
			else if ( token == TokenType.NORMAL_CHARACTER ) {
				fileWriter.write("<span style=\"color:green\">" + current.content + "</span>");
				System.out.println( "Character!" );
			}
			else if ( token != TokenType.NOTHING )
				fileWriter.write( "<span style=\"color:blue\"><b>" + current.content + "</b></span>" );
			else
				fileWriter.write( current.content );
		}

		fileWriter.write( "</p>\n</body>\n</html>\n" );
		fileWriter.flush();

		fileWriter.close();

	}

}
