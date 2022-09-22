
grammar Canto;

file        : (statement)+ ;

statement   : block
            | assign
            | varDecl
            | funcDecl
            | if
            | expr ';'
            | while
            | until
            | return
            | print
            ;

if          :
            'if' expr statement (elseIf)* (else)?
            ;

elseIf      : 'else if' expr statement
            ;

else        : 'else' statement
            ;

assign      : ID '=' expr ';'
            ;


varDecl     : mutVarDecl
            | immutVarDecl ;


mutVarDecl  : 'let' ID ':' type '=' expr ';' ;

immutVarDecl: 'set' ID ':' type '=' expr ';' ;

funcDecl    : 'func' ID '(' argList? ')' '->' type block ;

argList     : arg (',' arg)*
            | arg
            ;

arg         : ID ':' type ;

block       : '{' statement* '}' ;


print
            : 'print' '(' expr ')' ';';

while
            : 'while' '(' expr ')' block ;

until
            : 'until' '(' expr ')' block ;


expr        : ID '(' exprList? ')'  # Call
            | expr '[' expr ']'     # Index
            | '-' expr              # Negate
            | 'not' expr            # Not
            | expr '*' expr         # Mult
            | expr '+' expr         # Add
            | expr '-' expr         # Sub
            | expr '/' expr         # Div
            | expr '//' expr        # IntDiv
            | expr '%' expr         # Mod
            | expr '==' expr        # Equal
            | expr 'and' expr       # And
            | expr 'or' expr        # Or
            | expr 'xor' expr       # Xor
            | expr '<' expr         # LessThan
            | expr '<=' expr        # LessThanOrEqual
            | expr '>' expr         # GreaterThan
            | expr '>=' expr        # GreaterThanOrEqual
            | bool                  # Boolean
            | ID                    # Var
            | INT                   # Int
            | StringLiteral         # String
            | CharLiteral           # Char
            | '(' expr ')'          # Parens
            ;

exprList    : expr (',' expr)* ;

return      : 'return' expr ;

type        : 'float'
            | 'int'
            | 'bool'
            | 'char'
            | 'string'
            ;

bool        : 'true'
            | 'false'
            ;

K_FLOAT     : 'float' ;
K_INT       : 'int'  ;
K_VOID      : 'void' ;
K_BOOL      : 'bool' ;

ID          : LETTER (LETTER | [0-9])*  ;
LETTER      : [a-zA-Z]                  ;
INT         : [0-9]+ ;

CharLiteral
    : UnteriminatedCharLiteral '\''
    ;

UnteriminatedCharLiteral
    : '\'' (~["\\\r\n] | '\\' (. | EOF))
    ;

// This string literal rule was taken from the following SO post:
//  https://stackoverflow.com/a/24559773
StringLiteral
    : UnterminatedStringLiteral '"'
    ;

UnterminatedStringLiteral
    : '"' (~["\\\r\n] | '\\' (. | EOF))*
    ;


WS          : [ \t\n\r]+ -> skip ;

SL_COMMENT  : '//' .*? '\n' -> skip ;

