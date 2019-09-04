def  number = 0
new File('testfile').eachLine { line -> 
    number++ 
    println "$number: $line"
}
