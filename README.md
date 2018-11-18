# Acing the Software Engineering Interview

For a while now I am having second thoughts on pursuing a career in the software industry. I did not roll into it naturally with a degree in Computer Science. I initially pursued a degree in Business before I made the switch. I discovered the wonderful world of Machine Learning and slowly drifted towards becoming a Data Scientist / Software Engineer. Yet, since leaving college I have not done as much with either as I would have liked. I have a high paying job at a defense contractor, but due to the nature of working on an established application my abilities are hardly utilized. I am a software developer not an engineer - I believe it’s time to do something about that!
About a year ago I came across John Washam’s blog and GitHub page on how to 'Ace the Interview' at a big tech company and decided I want do the same. However, John readily admits he made a few mistakes. I intend to learn from them, and I hope you will too.
This list of topics will prepare you for becoming a Software Engineer / Data Scientist. And just like John Washam’s 'aim high' attitude, that includes Google, Apple, Amazon and Microsoft.

Essentially this list is structured into 2 knowledge parts: must know knowledge for being a Software Engineer and an introduction to Machine Learning.

The list includes references to texts, web pages, YouTube videos, MOOCs and Books. I intend to go easy on reading books and just give you the essential list. Reading takes up a lot of time and I fear knowledge is not retained. The scope of this list is also paired down as much as possible. However, I advice you to practice coding for as much as possible.

## Short description of Goals

### Things I want to achieve
	- Go through all the relevant subject material - even stuff I already know. By proceeding through all the material over a period of several months may help me understand the big picture of Computer Science.
	- Code a lot. I want to implement all the relevant examples of algorithms, data structures and applications to gain practical experience.
	- Test a lot. Code testing is laborious, boring but absolutely necessary. As this guide primarily deals with Java I will write test code using Junit and Mockito.
	- Retain as much knowledge as possible. Try and find a way to retain the knowledge.
	- Learn practical tips to becoming a Software Engineer. This means practicing for the interview, deal with issues such as fear, my introvertedness and how to work in an Agile / SCRUM way.

### Things I don’t want to do
	- Spend all of my free time on becoming a Software Engineer. John Washam admits he spent far too much time on his project. Currently I have a job and I don’t need a burnout.
	- Lose overview. There is such a thing as doing too much. Knowing when to stop is important and I will put that to the test.
	- Not to be afraid to re-invent the wheel. The goal is not to do something new, the goal is to learn to do something new.

## Interview Process & General Interview Prep
Here are some quick tutorials and tips to prepare for the interview process. I think it will give you a quick impression of what you don’t know!

- [ ] [ABC - Always Be Coding](https://medium.com/always-be-coding/abc-always-be-coding-d5f8051afce2)
- [ ] [Whiteboarding](https://writing.pupius.co.uk/whiteboarding-4df873dbba2e)
- [ ] [Demystifying Tech Recruiting](https://www.youtube.com/watch?v=N233T0epWTs)

## Pick a language
For the interview you will need to select one programming language. I have made the choice for you as I use Java. However, you will need to know more. You will also need to know a scripting language. The obvious choice is Python, which is also popular with Machine Learning.
As such there are coding example in both Java and [Python](https://github.com/JamesPiggott/PythonSoftwareEngineeringInterview)

## Book List
### Introductory
- [ ] [Linux, Programming and Hacking for Beginners](https://www.amazon.com/dp/B01N0CF3L5)
	- [ ] This is a book that I wrote. It is an abolute beginners text to Linux and its the command line. There are additional chapters onthe basics of programming and hacking. The text is written in a light-hearted tone and contains a number of side articles in which I explain topics of Computer Science. I also review several movies, games and books in which CS plays an important part. For $3.99 you pick up your own copy on Amazon and thereby support me.
### Java
- [ ] [Algorithms (Sedgewick and Wayne)](https://www.amazon.com/Algorithms-4th-Robert-Sedgewick/dp/032157351X/ref=la_B000AQ4JCO_1_1?s=books&ie=UTF8&qid=1504424836&sr=1-1)
### Python
- [ ] [An introduction to Programming in Python (Sedgewick, Wayne and Dondero)](https://www.amazon.com/Introduction-Programming-Python-Interdisciplinary-Approach/dp/0134076435/ref=sr_1_3?s=books&ie=UTF8&qid=1504424916&sr=1-3&keywords=an+introduction+to+programming+in+python)

## Part 1. Software Engineering
This part covers the basic of what a software engineer should know, by heart.

### Google tips
The people at Google have supplied a handy list of topics you need to master should you want to apply.
- [ ] [Google tips](https://careers.google.com/how-we-hire/interview/#interviews-for-software-engineering-and-technical-roles)

### Algorithmic complexity / Big-O / Asymptotic analysis
- [ ] [Cheat sheet](http://bigocheatsheet.com/)
- [ ] [Introduction Video](https://www.youtube.com/watch?v=V6mKVRU1evU)

### Data Structures
For the study of data structures and algorithms a three-pronged approach is used. First, a short descriptive video is linked (usually YouTube). Second, a simple implementation is referenced which the reader can examine. Third and finally a short descriptive text is linked in which the topic is discussed.
	
- [ ] Arrays: understand the (speed) difference between a static array and a dynamic (of type) Array.
	- [ ] [Video](https://www.youtube.com/watch?v=eNPX2pTiaHI)
- [ ] Linked Lists
	- [ ] [Video comparison of ArrayList and LinkedList](https://www.youtube.com/watch?v=WmvpGvQcVYs)
- [ ] Stack
- [ ] Queue
- [ ] Priority Queue
	- [ ] [StackOverflow](http://stackoverflow.com/questions/683041/java-how-do-i-use-a-priorityqueue)
- [ ] Hash table
	- [ ] [Introduction Video](https://www.youtube.com/watch?v=MfhjkfocRR0)
	- [ ] [CS50 tutorial with Lauren](https://www.youtube.com/watch?v=h2d9b_nEzoA)
	- [ ] [CS50 tutorial with Doug](https://www.youtube.com/watch?v=tjtFkT97Xmc)
	- [ ] implement hash table with chaining
	- [ ] implement hash table with linear probing
	
### Algorithms

#### Sorting algorithms
- [ ] Selection sort
	- [ ] [Sedgewick: Selection sort](https://www.youtube.com/watch?v=cJF9vjz89vU)
- [ ] Insertion sort
	- [ ] [Sedgewick: Insertion sort](https://www.youtube.com/watch?v=alh3Jme9LZs)
- [ ] Merge sort
	- [ ] [Sedgewick: Merge sort](https://www.youtube.com/watch?v=Sk7IZESPgjk)
- [ ] Heapsort
	- [ ] [In 4 minutes](https://www.youtube.com/watch?v=2DmK_H7IdTo)
	- [ ] [Sedgewick: Binary Heap](https://www.youtube.com/watch?v=YXCeM7w1630&list=PLxc4gS-_A5VDXUIOPkJkwQKYiT2T1t0I8&index=35)
	- [ ] [Sedgewick: Heapsort](https://www.youtube.com/watch?v=H7rI5qtsf_Y&index=36&list=PLxc4gS-_A5VDXUIOPkJkwQKYiT2T1t0I8)
- [ ] Quicksort
	- [ ] [In 4 minutes](https://www.youtube.com/watch?v=Hoixgm4-P4M)
	- [ ] [Sedgeqick: Quicksort](https://www.youtube.com/watch?v=lJd7vhhCclg)
- [ ] To cap it off read the wiki page throughly [Wikipedia](https://en.wikipedia.org/wiki/Sorting_algorithm)

#### Searching algorithms
Both search algorithm below are simple to implement, perhaps even trivial. Yet they naturally flow into the topic of Graphs.
- [ ] Linear Searching
- [ ] Binary Search
	- [ ] [Video](https://www.youtube.com/watch?v=1ruyrpTKGZk)

### Graphs
Graphs are an important aspect in Computer Science. Many problems can be explained and solved as Graphs.
- [ ] [Sedgewick: 9 minute introduction](https://www.youtube.com/watch?v=f_-qGQgzBLg&t=331s)

Graphs can be represented as
- [ ] [Adjancency Matrix](https://www.youtube.com/watch?v=9C2cpQZVRBA)
- [ ] [Adjency List](https://www.youtube.com/watch?v=k1wraWzqtvQ)
	
Graphs can be traversed with algorithms such as:
- [ ] Breadth-first search
	- [ ] [MIT: 50 minutes](https://www.youtube.com/watch?v=s-CYnVz-uh4)
- [ ] Depth-first search
	- [ ] [MIT: 50 minutes](https://www.youtube.com/watch?v=AfSk24UTFS8)
- [ ] Dijkstra's algorithm
	- [ ] [Den of Geeks](http://www.geeksforgeeks.org/greedy-algorithms-set-6-dijkstras-shortest-path-algorithm/)
	- [ ] [Video](https://www.youtube.com/watch?v=gdmfOwyQlcI)
- [ ] A* algorithm
	- [ ] [Redblobgames](http://www.redblobgames.com/pathfinding/a-star/introduction.html)
	- [ ] [Stanford](http://theory.stanford.edu/~amitp/GameProgramming/AStarComparison.html)
- [ ] Convex Hull algorithm
	- [ ] [YouTube](https://www.youtube.com/watch?v=XIAQRlNkJAw&feature=youtu.be&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&t=3164)
	- [ ] [YouTube](https://www.youtube.com/watch?v=J5aJEcOr6Eo&index=10&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm)
	- [ ] [YouTube](https://www.youtube.com/watch?v=EzeYI7p9MjU&list=PLUl4u3cNGP6317WaSNfmCvGym2ucw3oGp&index=2)
	
Graphs are a complicated topic. The algorithms to traverse them are not easy to implement. If you find it difficult to use the videos and texts above then sign up for a MOOC course. 2 years ago I did [Object Oriented Java Programming: Data Structures and Beyond](https://www.coursera.org/specializations/java-object-oriented). It really helped me see the big picture. The third course in the specialization (Advanced Data Structures in Java) is on Graphs.

### Mathematics
#### Logarithms
- [ ] [Logarithms, Explained 3 minute video](https://www.youtube.com/watch?v=zzu2POfYv0Y)

## Part 2. Advanced topics with Java
In this part I cover the advanced topics. I used Java because it is the language I am most comfortable with, but try and code in Python if you can.

### Advanced Java
- [ ] Bitwise Operations
	- [ ] A question on how to swap two variables without using a third is bound to come up in an job interview. The small video below gives an implementation. Try to expand it with a speed test!
		- [ ] [Video](https://www.youtube.com/watch?v=mJG1DManmLc)
- [ ] Recursion
- [ ] Object-Oriented Programming
- [ ] Design Patterns
- [ ] Multi-Threading
- [ ] String searching
- [ ] Tries
	- [ ] [HackerRank Introductory video](https://www.youtube.com/watch?v=zIjfhVPRZCg)
	- [ ] [HackerRank advanced example](https://www.youtube.com/watch?v=vlYZb68kAY0)
- [ ] Unicode
- [ ] Endianness
	- [ ] [Micheal gives a small introduction](https://www.youtube.com/watch?v=JrNF0KRAlyo)

### Network coding
A basic understanding of network coding is needed if you are expected to connect appliations. Luckily Java is very powerfull and makes network coding easy!
- [ ] [Java Sockets 1 of 3](https://www.youtube.com/watch?v=6G_W54zuadg&t=6s)
- [ ] [Java Sockets 2 of 3](https://www.youtube.com/watch?v=Uo5DY546rKY)
- [ ] [Java Sockets 3 of 3](https://www.youtube.com/watch?v=mJG1DManmLc)
- [ ] [Exerise: create a chat program. Allow to clients to communicate through a server]

Now you should have the basic skills to create applications. If you want to prepare thoroughly for the interview I suggest you also watch and read the following tutorials. Try to create small programs to improve your understanding. It is not necessary to have 2 computers but it is recommended to try

#### Basics of Internet, OSI model
- [ ] [TCP/IP and the OSI Model Explained!](https://www.youtube.com/watch?v=e5DEVa9eSN0)

#### Remote Method Invocation
Arguably Remote Method Invocation straddles Network coding and application programming, but if you want a job at a large company you may need to know it.
- [ ] [A quick practical tutorial](https://www.mkyong.com/java/java-rmi-hello-world-example/)
- [ ] [Another small tutorial](https://www.cs.ucsb.edu/~cappello/lectures/rmi/helloworld.shtml)
- [ ] [Part 1 of 3: Simple Java RMI Tutorial](https://www.youtube.com/watch?v=ILeAeFZOkMI)
- [ ] [Part 2 of 3: Simple Java RMI Tutorial](https://www.youtube.com/watch?v=OjXTkgW0wDQ)
- [ ] [Part 3 of 3: Simple Java RMI Tutorial](https://www.youtube.com/watch?v=vkw275ptI3E)

#### Web servers and servlets
To generate webpages you could use Apache, but Java also comes with its own web server - Jetty. This section continues the theme of network programming, but now through the use of http. We will start of easy with some introductory reading, followed some in-depth videos before some suggested programming assignments.
- [ ] [Jetty wiki page](https://en.wikipedia.org/wiki/Jetty_(web_server))
- [ ] [Web server wiki page](https://en.wikipedia.org/wiki/Web_server)
- [ ] [Java servlet wiki page](https://en.wikipedia.org/wiki/Java_servlet)
- [ ] [YouTube: What is Jetty?](https://www.youtube.com/watch?v=lvZfEXqIAyE&t=496s)

### Garbage collection
- [ ] [Garbage collection in Java](https://www.youtube.com/watch?v=UnaNQgzw4zY)

### Lambda functions
Lambda functions were introduced with Java 8 in 2014. Lambda's are [anonymous functions](https://en.wikipedia.org/wiki/Anonymous_function) that can be passed as an argument or even returned as a value. They form a major part of [Functional Programming](https://en.wikipedia.org/wiki/Functional_programming), but can be tricky to understand.
Below is a link to the first video in a series of 25 by Koushik as he explains their relevance and use. The videos are short and to the point. So grab a coffee and start your introduction to Lambda's
 - [ ] [YouTube: Java 8 Lambda Basics 1 - Introduction](https://www.youtube.com/watch?v=gpIUfj3KaOc&t=0s&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3&index=2)
 
### Parallel Programming
With parallel programming you can write algorithms that can efficiently make use of all the processing cores of a computer. This topic makes use of Lambda expression. In Java there are now APIs that allow programmers easy use of this concept.

For those eager to do a deep dive, there is a Coursera specialization: [Parallel, Concurrent, and Distributed Programming in Java Specialization](Parallel, Concurrent, and Distributed Programming in Java Specialization). I just finished the first course and I believe I now have a much firmer grasp of this topic. As always the lectures and coding examples allow for a much deep understanding than a YouTube video.
- [ ] [Parallel Programming in Java](https://www.coursera.org/learn/parallel-programming-in-java)
- [ ] [Concurrent Programming in Java](https://www.coursera.org/learn/concurrent-programming-in-java)
- [ ] [Distributed Programming in Java](https://www.coursera.org/learn/distributed-programming-in-java)

### Compilers
More to follow

### Operating Systems
More to follow

### Graphical User Interfaces
GUIs are simple enough to implement but hard to master. Below are several quick videos on how to start implementing GUIs in Python with the PyQT5 framework.
 - [ ] [YouTube: Getting Started With PyQt 5](https://www.youtube.com/watch?v=FUlnu6DE1mI)
 - [ ] [YouTube: Part 1 of PyQt5 tutorial](https://www.youtube.com/watch?v=pnpL9Sl79g8&list=PL1FgJUcJJ03uwFW8ys2ov2dffKs3ieGYk&index=2&t=0s)

### Programming Languages
 - [ ] [YouTube: basic categories of programming languages](https://www.youtube.com/watch?v=_zusEe3GOe8)
 - [ ] [YouTube: advanced distinctive features of programming languages](https://www.youtube.com/watch?v=GI_V3yzVDtA)
 - [ ] [YouTube: the first programming languages - a bit of history](https://www.youtube.com/watch?v=RU1u-js7db8)

### Papers
Below is a list of papers (scientific and otherwise). They are not mandatory to read but they do discus the latest developments in IT. I find them inspiring to read.

## Part 3. Machine Learning
This part covers the most interesting parts, the very reason I continue to study computer science. Note that a lot of the material is new and not well established. That is what makes it so exciting.

### Google Machine Learning Crash course
Again the people at Google are the best organized and have come up with a small online course that cover most of the relevant topics
- [ ] [ML crash course](https://developers.google.com/machine-learning/crash-course/ml-intro)

### Deeplearning.ai
Currently I am doing this specialization on coursera given by renowned AI specialist Andrew Ng. It is a successor to his earlier course offered by the University of Stanford which I did in 2014.
This new specialization is highly recommended. It will give you skills you can immediately apply, though not the experience.
- [ ] [Neural Networks and Deep Learning](https://www.coursera.org/learn/neural-networks-deep-learning)
- [ ] [Improving Deep Neural Networks](https://www.coursera.org/learn/deep-neural-network)
- [ ] [Structuring Machine Learning Projects](https://www.coursera.org/learn/machine-learning-projects)
- [ ] [Convolutional Neural Networks](https://www.coursera.org/learn/convolutional-neural-networks)
- [ ] [Sequence Models](https://www.coursera.org/learn/nlp-sequence-models)

### Books
- [ ] [Machine Learning: An Algorithmic Perspective](https://www.amazon.com/Machine-Learning-Algorithmic-Perspective-Recognition/dp/1466583282/ref=pd_lpo_sbs_14_img_0?_encoding=UTF8&psc=1&refRID=WMZP7275AW67BMKFSPX2)
- [ ] [Python Deep Learning](https://www.amazon.com/Python-Deep-Learning-Valentino-Zocca/dp/1786464454/ref=sr_1_1?s=books&ie=UTF8&qid=1497788093&sr=1-1&keywords=python+deep+learning)
- [ ] [Make Your Own Neural Network](https://www.amazon.com/Make-Your-Own-Neural-Network/dp/1530826608/ref=sr_1_1?s=books&ie=UTF8&qid=1497788137&sr=1-1&keywords=neural+networks)

### Deep Learning
Deep Learning is quickly becoming a craze, and I think it is deservedly so. For an excellent but easy introduction read Python Deep Learning. There is a link above. For specific applications I have posted links below
- [ ] [Cheat Sheets](https://becominghuman.ai/cheat-sheets-for-ai-neural-networks-machine-learning-deep-learning-big-data-678c51b4b463)

At this moment there are a number of ways to implement Deep Learning on datasets: Theano, Tensorflow and Keras to name a few. Below is an introductory video.
- [ ] [Deep Learning Frameworks Compared](https://www.youtube.com/watch?v=MDP9FfsNx60)

#### Keras
The easiest way to quickly learn how to program Deep Learning solutions is through Keras. Developed by Francois Chollet at Google it is layer on top of Theano or TensorFlow - the two main frameworks used. Below are a set of easy to follow tutorials that culminate in a solution designed to be scalable and which can be accessed through an REST Api.
- [ ] [Deploying Keras solution](https://www.youtube.com/watch?v=f6Bf3gl4hWY)
- [ ] [A Simple CNN tutorial](https://www.datacamp.com/community/tutorials/convolutional-neural-networks-python)
- [ ] [A Simple RNN tutorial](https://www.kaggle.com/amarpreetsingh/stock-prediction-lstm-using-keras)
- [ ] [REST API with Flask and cURL](https://blog.keras.io/building-a-simple-keras-deep-learning-rest-api.html)
- [ ] [Advanced REST API (scalable, message queuing)](https://www.pyimagesearch.com/2018/01/29/scalable-keras-deep-learning-rest-api/)

There are also a number of books on Keras. Note that Keras is still very new - yet it is quickly being adopted.
- [ ] [Deep Learning with Python](https://www.amazon.com/Deep-Learning-Python-Francois-Chollet/dp/1617294438/ref=sr_1_1?ie=UTF8&qid=1523989891&sr=8-1&keywords=francois+chollet)
	- Written by Francois Chollet himself. The book is practically new (October 2017), but is already considered the bible to Keras. It is also easy to work with

All topics above are about using Deep Learning with Python. It shows you why Python is so important.

### Vectorization
With Vectorization we can greatly increase the number of operations per instruction - that is, reduce the number of loop iterations because we do more per loop. With Machine Learning using Linear Algebra this has become vital to optimize resources.
- [ ] [What is Vectorization? StackOverflow](https://stackoverflow.com/questions/1422149/what-is-vectorization)
- [ ] [What is Vectorization? Andrew Ng](https://www.coursera.org/learn/neural-networks-deep-learning/lecture/NYnog/vectorization)
- [ ] [Vectorization 101](https://www.youtube.com/watch?v=Aez5DvI0bwU)

Lets get dirty with vectorization and use the Python Numpy library
- [ ] [Loosing your loops! Jake VanderPlas](https://www.youtube.com/watch?v=EEUXKG97YRw)

### Numpy
Numpy is an important library that any Data Scientist should be familiar with, use it to vectorize, lambdadize and otherwise perform operations on data.
- [ ] [Introduction: Arrays in Python / Numpy](https://www.youtube.com/watch?v=mOZ0UCeuRX4)

## Part 4. Practicing for the Interview
After learning many of the topics described in the sections on Software Engineering and Machine Learning you should have a well rounded knowledge base. To actually get a job at the company of your choice you will need to ace the interview. This section will concentrate on all that is necessary to accomplish just that. If you want to continue learning take a look at the section below entitled Other Topics.

### Coding Exercises
If you are uncertain how well you can code when facing an unexpected challenge try a coding challenge. Seriously there are plenty of online challenge sites.

Some help with challenges
- [ ] [TopCode tips](https://www.topcoder.com/community/data-science/data-science-tutorials/how-to-find-a-solution/)

Challenge websites
- [ ] [CoderByte](https://coderbyte.com/)
- [ ] [TopCode](https://www.topcoder.com/)
- [ ] [Interactive Jupiter Python](https://github.com/donnemartin/interactive-coding-challenges)

## Part 5. Other topics
### More Books
- [ ] [Hacking: The Art of Exploitation](https://www.amazon.com/Hacking-Art-Exploitation-Jon-Erickson/dp/1593271441/ref=la_B001JP4N76_1_3?s=books&ie=UTF8&qid=1497793864&sr=1-3&refinements=p_82%3AB001JP4N76)
	- An essential must read for it chapters on Crytpology, Network attacks and Stack Overflows. The book is not an tome, but beginners might have some difficulty.
- [ ] [Penetration Testing: A Hands-On Introduction to Hacking](https://www.amazon.com/Penetration-Testing-Hands-Introduction-Hacking/dp/1593275951/ref=la_B00JAM3QNC_1_1?s=books&ie=UTF8&qid=1497794043&sr=1-1&refinements=p_82%3AB00JAM3QNC)
	- This books by Georgia Weidman has been a favorite of mine since 2014. It is both both broad and in-depth and covers most topics regarding computer hacking.

### More Programming languages
The coding interviews taking by tech companies usually concentrate on just one language. The interviewee can choose from a small selection: usually C, Java or Python. However, there is a much larger world involving databases and web programming. Knowing other languages becomes vital – just not for the interview. As an option choose one of the languages to round out your skills. I choose the Go programming language. 
- [ ] Go: Google's own multi-paradigm language.
	- [Book: The Go Programming Language](https://www.amazon.com/Programming-Language-Addison-Wesley-Professional-Computing/dp/0134190440)
	- [Video](https://www.youtube.com/watch?v=29LLRKIL_TI)
- [ ] R: A language that focuses on statisical analysis, but it has lost some important in Machine Learning in favor of Python.
- [ ] Swift
- [ ] Ruby
- [ ] Julia: A new scientific general purpose language.
- [ ] JavaScript

### Cloud computing and containers
Currently I am pursuing the Coursera specialization Developing Applications with Google Cloud Platform.
Being able to deploy your application and machine learning models quickly is a definite must.
	
### Web Programming
More on REST APIs here

### Learning Linux
I already covered a lot of this in my book - [Linux, Programming and Hacking for Beginners](https://www.amazon.com/dp/B01N0CF3L5) - but it is something you will need to concentrate on.

### Databases and SQL

### NoSQL
Although relational databases are the bread and butter of data management there are other variants - such as NoSQL
- [ ] [YouTube: What is NoSQL?](https://www.youtube.com/watch?v=BgQFJ_UNIgw)

### Loose ends
Here is a list of skills I am working on to better represent myself. This list focuses on soft skills, neat office skills and some psychology.
- [ ] [EdClub](https://www.typingclub.com/sportal/)
	- It may suprise you I never learned blind typing. I mostly type with my index and middle fingers. The typing speed is not bad but people have remarked on it.
- [ ] [Hot keys]	

## Near time goals
Here is small list of personal goals that I will try to accomplish in 2018.

December
- [ ] [Multi-Threading]
- [ ] [REST APIs]
- [ ] [Graphs: Dijkstra's algorithm]
- [ ] [Compilers]