
import java.io.*;
import java_cup.runtime.*;

%%

%public
%line
%column

%class MyScanner
%unicode

%function readNext

%%

<YYINITIAL> {

	/* keywords */
	"auto"          { return symbol(AUTO); }
	"double"        { return symbol(DOUBLE); }
	"int"           { return symbol(INT); }
	"struct"        { return symbol(STRUCT); }
	"const"         { return symbol(CONST); }
	"float"         { return symbol(FLOAT); }
	"short"         { return symbol(SHORT); }
	"unsigned"      { return symbol(UNSIGNED); }
	"break"         { return symbol(BREAK); }
	"else"          { return symbol(ELSE); }
	"long"          { return symbol(LONG); }
	"switch"        { return symbol(SWITCH); }
	"continue"      { return symbol(CONTINUE); }
	"for"           { return symbol(FOR); }
	"signed"        { return symbol(SIGNED); }
	"void"          { return symbol(VOID); }
	"case"          { return symbol(CASE); }
	"enum"          { return symbol(ENUM); }
	"register"      { return symbol(REGISTER); }
	"typedef"       { return symbol(TYPEDEF); }
	"default"       { return symbol(DEFAULT); }
	"goto"          { return symbol(GOTO); }
	"sizeof"        { return symbol(SIZEOF); }
	"volatile"      { return symbol(VOLATILE); }
	"char"          { return symbol(CHAR); }
	"extern"        { return symbol(EXTERN); }
	"return"        { return symbol(RETURN); }
	"union"         { return symbol(UNION); }
	"do"            { return symbol(DO); }
	"if"            { return symbol(IF); }
	"static"        { return symbol(STATIC); }
	"while"         { return symbol(WHILE); }

}