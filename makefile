$SOURCES = $(wildcard **/*.java)

Tigger.class: Tigger.java $(SOURCES)
	javac Tigger.java

Tigger.java: Tigger.jj
	javacc Tigger.jj
	
clean:
	$(RM) *.class
	$(RM) ast/*.class
	$(RM) ParseException.java Tigger.java TokenMgrError.java SimpleCharStream.java TiggerTokenManager.java TiggerConstants.java Token.java
