var myArray : Array[String] = Array("\nSCALA REFERENCES",
									"**********************",
									"Getting Started:",
									"http://www.scala-lang.org/documentation/getting-started.html \n",
									"Download:",
									"http://www.scala-lang.org/download/ \n",
									"Examples:",
									"http://www.scala-lang.org/old/node/219 \n",
									"More Basics:",
									"https://twitter.github.io/scala_school/basics.html \n",
                                    "Free Coursera Course:",
									"https://www.coursera.org/course/progfun \n",
                                    "Gatling Load Testing:",
									"http://gatling.io \n")

for(myString <- myArray) {
    println(myString);
}