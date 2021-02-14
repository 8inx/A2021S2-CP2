#---------------------------
# version :1.0
# author  :Acebo, Dale 
#---------------------------

JC := javac
JR := java
MainClass := "public static void main(String\[\] args)"

# make [package name] - build and run java files within the package
%:	./src/%/*.java
	@$(JC) -d ./bin/$@ ./src/$@/*.java
	clear
	@echo "\n"
	@java -cp ./bin/$@ $$(grep -l -R $(MainClass) ./src/$@/* | cut -d '/' -f 4 | cut -d '.' -f 1)
	@echo "\n"

clean:
	rm -rf ./bin/*