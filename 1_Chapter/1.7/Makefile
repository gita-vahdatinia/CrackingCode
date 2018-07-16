JFLAGS = -g
JC = javac
JVM = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	RotateMatrix.java

MAIN = RotateMatrix


default: classes

classes: $(CLASSES:.java=.class)

run: classes
		$(JVM) $(MAIN)
clean:
	$(RM) *.class
