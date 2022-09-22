# CantoLang
Canto language is my way of exploring deeper into how interpreters and compilers work. This language was built using ANTLRv4 for Java, particularly the entire 
lexer and parser were written/generated using ANTLR and the code is currently being interpreted using their visitor methods.

## Current Features
- Support for mutable and immutable variables through the `var` and `let` keywords, respectively.
- Scoping based off either global scope, function scope, or user defined blocks (`{ block }`)
- Support for most of the basic imperative looping mechanisms (`while` and `for` loop) along with the interesting addition of `until` which is simply just `while (not cond)`. Obviously `if-else` are also supported.


## Planned Features
- First class functions that can be passed as parameters and returned from functions.
- Generics
- Basic class system
