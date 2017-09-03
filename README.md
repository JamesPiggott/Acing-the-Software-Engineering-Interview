# Acing the Software Engineering Interview

For a while now I am having second thoughts on pursuing a career in the software industry. I did not roll into it naturally with a degree in CS. I initially pursued a degree in Business before I made the switch to Business & Information Technology. I discovered the wonderful world of Machine Learning along the way and slowly drifted towards becoming a Data Scientist / Software Engineer. Yet, since leaving college I have done little with either. I have a high paying job at a defense contractor, but due to the nature of working on an established application my abilities are hardly utilized. I am a software developer not an engineer - it’s time to do something about.
For some time, I have been interested on becoming a fully developed Data Scientist and Software Engineer. Recently I came across John Washam’s blog and GitHub page on how to ace the interview at a big company and decided I want do the same. However, John readily admits he made a few mistakes that he would undo if he could. I intend to learn from them, and I hope you will too.
This list of items will prepare you for becoming a Software Engineer and a Data Scientist at any software company. And just like John Washam’s aim high attitude, that includes Google, Apple, Amazon and Microsoft.
So essentially this list is structured into 2 knowledge parts: must know knowledge for being a Software Engineer and an introduction to Machine Learning.
The list includes references to texts, web pages, YouTube videos, MOOCs and Books. I intend to go easy on reading books and just give you the essential list. Reading takes up a lot of time and I fear knowledge is not retained. The scope of this list is also paired down as much as possible. 

## Short description of Goals

### Things I want to achieve
	- Go through all the relevant subject material - even stuff I already know. By proceeding through all the material over a period of several months may help me understand the big picture of Computer Science.
	- Code a lot. I want to implement all the relevant examples of algorithms, data structures and applications to gain practical experience.
	- Test a lot. Code testing is laborious, boring but absolutely necessary. As this guide primarily deals with Java I will write test code using Junit and Mockito.
	- Retain as much knowledge as possible. Try and find a way to retain the knowledge.
	- Learn practical tips to becoming a Software Engineer. This means practicing for the interview, deals with issues such as fear and how to work in an Agile / SCRUM way.

### Things I don’t want to do
	- Spend all of my free time on becoming a Software Engineer. John Washam admits he spent far too much time on this project. Currently I have a job and I don’t need a burnout.
	- Lose overview. There is such a thing as doing too much. Knowing when to stop is important and I will put that to the test.
	- Not to be afraid to re-invent the wheel. The goal is not to do something new, the goal is to learn to do something new.

## Interview Process & General Interview Prep
Here are some quick tutorials and tips to prepare for the interview process. I think it will give you a quick impression of what you don’t know!

- [ ] [ABC - Always Be Coding](https://medium.com/always-be-coding/abc-always-be-coding-d5f8051afce2)
- [ ] [Whiteboarding](https://writing.pupius.co.uk/whiteboarding-4df873dbba2e)
- [ ] [Demystifying Tech Recruiting](https://www.youtube.com/watch?v=N233T0epWTs)

## Pick a language
For the interview you will need to select one programming language. I have made the choice for you as I use Java. However, you will need to know more. You will also need to know a scripting language. The obvious choice is Python, which is also popular with Machine Learning.

## Book List
### Introductory
- [ ] [Linux, Programming and Hacking for Beginners](https://www.amazon.com/dp/B01N0CF3L5)
	- [ ] This is a book that I wrote. It is an abolute beginners text to Linux and its the command line. There are additional chapters onthe basics of programming and hacking. The text is written in a light-hearted tone and contains a number of side articles in which I explain topics of Computer Science. I also review several movies, games and books in which CS plays an important part. For $3.99 you pick up your own copy on Amazon and thereby support me.
### Java
- [ ] [Algorithms (Sedgewick and Wayne)](https://www.amazon.com/Algorithms-4th-Robert-Sedgewick/dp/032157351X/ref=la_B000AQ4JCO_1_1?s=books&ie=UTF8&qid=1504424836&sr=1-1)
### Python
- [ ] [An introduction to Programming in Python (Sedgewick, Wayne and Dondero)](https://www.amazon.com/Introduction-Programming-Python-Interdisciplinary-Approach/dp/0134076435/ref=sr_1_3?s=books&ie=UTF8&qid=1504424916&sr=1-3&keywords=an+introduction+to+programming+in+python)

## Software Engineering
### Basics of Java

### Algorithmic complexity / Big-O / Asymptotic analysis
- [ ] [Cheat sheet] (http://bigocheatsheet.com/)
- [ ] [Introduction Video]	(https://www.youtube.com/watch?v=V6mKVRU1evU)

### Data Structures
For the study of data structures and algorithms a three-pronged approach is used. First, a short descriptive video is linked (usually YouTube). Second, a simple implementation is referenced which the reader can examine. Third and finally a short descriptive text is linked in which the topic is discussed.
	
- [ ] Arrays: understand the (speed) difference between a static array and a dynamic (of type) Array.
	- [ ] [Video](https://www.youtube.com/watch?v=eNPX2pTiaHI)
- [ ] Linked Lists
	- [ ] [Video comparison of ArrayList and LinkedList](https://www.youtube.com/watch?v=WmvpGvQcVYs)
- [ ] Stack
- [ ] Queue
- [ ] Hash table
	- [ ] [Introduction Video](https://www.youtube.com/watch?v=MfhjkfocRR0)
	- [ ] [CS50 tutorial with Lauren](https://www.youtube.com/watch?v=h2d9b_nEzoA)
	- [ ] [CS50 tutorial with Doug](https://www.youtube.com/watch?v=tjtFkT97Xmc)
	- [ ] implement hash table with chaining
	- [ ] implement hash table with linear probing
	
### Algorithms

#### Sorting algorithms
- [ ] Selection sort
	- [ ] [Sedgewick: Selection sort] (https://www.youtube.com/watch?v=cJF9vjz89vU)
- [ ] Insertion sort
	- [ ] [Sedgewick: Insertion sort] (https://www.youtube.com/watch?v=alh3Jme9LZs)
- [ ] Merge sort
	- [ ] [Sedgewick: Merge sort] (https://www.youtube.com/watch?v=Sk7IZESPgjk)
- [ ] Heapsort
	- [ ] [In 4 minutes] (https://www.youtube.com/watch?v=2DmK_H7IdTo)
	- [ ] [Sedgewick: Binary Heap] (https://www.youtube.com/watch?v=YXCeM7w1630&list=PLxc4gS-_A5VDXUIOPkJkwQKYiT2T1t0I8&index=35)
	- [ ] [Sedgewick: Heapsort] (https://www.youtube.com/watch?v=H7rI5qtsf_Y&index=36&list=PLxc4gS-_A5VDXUIOPkJkwQKYiT2T1t0I8)
- [ ] Quicksort
	- [ ] [In 4 minutes] (https://www.youtube.com/watch?v=Hoixgm4-P4M)
	- [ ] [Sedgeqick: Quicksort] (https://www.youtube.com/watch?v=lJd7vhhCclg)
- [ ] To cap it off read the wiki page throughly (https://en.wikipedia.org/wiki/Sorting_algorithm)

#### Searching algorithms
Both search algorithm below are simple to implement, perhaps even trivial. Yet they anturally flow into the topic of Graphs.
- [ ] Linear Searching
- [ ] Binary Search
	- [ ] [Video](https://www.youtube.com/watch?v=1ruyrpTKGZk)

### Graphs
Graphs are an important aspect in Computer Science. Many problems can be explained and solved as Graphs. An example would be social networks, personal relations can be seen as graph edges.

Graphs can be represented as

	- Adjancency Matrix
	- Adjency List
	
Graphs can be traversed with algorithms such as:

- [ ] Breadth-first search
- [ ] Depth-first search
- [ ] Dijkstra's algorithm
	- [ ] [Den of Geeks](http://www.geeksforgeeks.org/greedy-algorithms-set-6-dijkstras-shortest-path-algorithm/)
	- [ ] [Video](https://www.youtube.com/watch?v=gdmfOwyQlcI)
- [ ] A* algorithm
	- [ ] [Redblobgames](http://www.redblobgames.com/pathfinding/a-star/introduction.html)
	- [ ] [Stanford](http://theory.stanford.edu/~amitp/GameProgramming/AStarComparison.html)
- [ ] Priority Queue
	- [ ] [StackOverflow](http://stackoverflow.com/questions/683041/java-how-do-i-use-a-priorityqueue)

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
- [ ] Unicode
- [ ] Endianness
	- [ ] [Micheal gives a small introduction](https://www.youtube.com/watch?v=JrNF0KRAlyo)

#### Network coding
A basic understanding of network coding is needed if you are expected to connect appliations. Luckily Java is very powerfull and makes network coding easy!
- [ ] [Java Sockets 1 of 3](https://www.youtube.com/watch?v=6G_W54zuadg&t=6s)
- [ ] [Java Sockets 2 of 3](https://www.youtube.com/watch?v=Uo5DY546rKY)
- [ ] [Java Sockets 3 of 3](https://www.youtube.com/watch?v=mJG1DManmLc)
- [ ] [Exerise: create a chat program. Allow to clients to communicate through a server]

Now you should have the basic skills toc reate applications. If you want to prepare thoroughly for the interview I suggest you also watch and read the following tutorials. Try to create small programs to improve your understanding. It is not necessary to have 2 computers but it is recommended to try

##### Basics of Internet, OSI model
- [ ] [TCP/IP and the OSI Model Explained!](https://www.youtube.com/watch?v=e5DEVa9eSN0)

Advanced Networking -> moving to the hacker realm

##### Remote Method Invocation
- [ ] [A quick practical tutorial](https://www.mkyong.com/java/java-rmi-hello-world-example/)
- [ ] [Another small tutorial](https://www.cs.ucsb.edu/~cappello/lectures/rmi/helloworld.shtml)
- [ ] [Part 1 of 3: Simple Java RMI Tutorial](https://www.youtube.com/watch?v=ILeAeFZOkMI)
- [ ] [Part 2 of 3: Simple Java RMI Tutorial](https://www.youtube.com/watch?v=OjXTkgW0wDQ)
- [ ] [Part 3 of 3: Simple Java RMI Tutorial](https://www.youtube.com/watch?v=vkw275ptI3E)
Arguably Remote Method Invocation straddles Network coding and application programming, but if you want a job at a large company you may need to know it.

### More Java Topics
#### Garbage collection
- [ ] [Garbage collection in Java](https://www.youtube.com/watch?v=UnaNQgzw4zY)

### Mathematics
#### Logarithms
- [ ] [Logarithms, Explained 3 minute video](https://www.youtube.com/watch?v=zzu2POfYv0Y)


## Machine Learning
### Books
- [ ] [Machine Learning: An Algorithmic Perspective](https://www.amazon.com/Machine-Learning-Algorithmic-Perspective-Recognition/dp/1466583282/ref=pd_lpo_sbs_14_img_0?_encoding=UTF8&psc=1&refRID=WMZP7275AW67BMKFSPX2)
- [ ] [Python Deep Learning](https://www.amazon.com/Python-Deep-Learning-Valentino-Zocca/dp/1786464454/ref=sr_1_1?s=books&ie=UTF8&qid=1497788093&sr=1-1&keywords=python+deep+learning)
- [ ] [Make Your Own Neural Network](https://www.amazon.com/Make-Your-Own-Neural-Network/dp/1530826608/ref=sr_1_1?s=books&ie=UTF8&qid=1497788137&sr=1-1&keywords=neural+networks)

### Deep Learning
Deep Learning is quickly becoming a craze, and I think it is deservedly so. For an excellent but easy introduction read Python Deep Learning. There is a link above. For specific applications I have posted links below
- [ ] [Cheat Sheets] (https://becominghuman.ai/cheat-sheets-for-ai-neural-networks-machine-learning-deep-learning-big-data-678c51b4b463)

#### Keras
- [ ] [Deploying Keras solution](https://www.youtube.com/watch?v=f6Bf3gl4hWY)


#### TensorFlow

#### Theano

All three topics above are about using Deep Learning with Python. It shows you why Python is so important.

## Practicing for the Interview
After learning many of the topics described in the sections on Software Engineering and Machine Learning you should have a well rounded knowledge base. To get actually get a job at the company of your choice you will need to ace the interview. This section will concentrate on all that is necessary to accomplish just that. If you want to continue learning take a look at the section below entitled Other Topics.

### Coding Exercises
If you are uncertain how well you can code when facing an unexpected challenge try a coding challenge. Seriously there are plenty of online challenge sites.

Some help with challenges
- [ ] [TopCode tips] (https://www.topcoder.com/community/data-science/data-science-tutorials/how-to-find-a-solution/)

Challenge websites
- [ ] [TopCode] (https://www.topcoder.com/)
- [ ] [Interactive Jupiter Python] (https://github.com/donnemartin/interactive-coding-challenges)
  


## Other topics
### More Books
- [ ] [Hacking: The Art of Exploitation](https://www.amazon.com/Hacking-Art-Exploitation-Jon-Erickson/dp/1593271441/ref=la_B001JP4N76_1_3?s=books&ie=UTF8&qid=1497793864&sr=1-3&refinements=p_82%3AB001JP4N76)
	- An essential must read for it chapters on Crytpology, Network attacks and Stack Overflows. The book is not an tome, but beginners might have some difficulty.
- [ ] [Penetration Testing: A Hands-On Introduction to Hacking](https://www.amazon.com/Penetration-Testing-Hands-Introduction-Hacking/dp/1593275951/ref=la_B00JAM3QNC_1_1?s=books&ie=UTF8&qid=1497794043&sr=1-1&refinements=p_82%3AB00JAM3QNC)
	- This books by Georgia Weidman has been a favorite of mine since 2014. It is both both broad and in-depth and covers most topics regarding computer hacking.

### More Programming languages
The coding interviews taking by large companies usually concentrate on just one language. The interviewee can choose from a small selection: usually C, Java or Python. However, there is a much larger world involving databases and web programming. Knowing other languages becomes vital – just not for the interview. Try and choose from the list below.
	
- [ ] Go: Google's own multi-paradigm language.
	- Book: The Go Programming Language (https://www.amazon.com/Programming-Language-Addison-Wesley-Professional-Computing/dp/0134190440)
	- Video: https://www.youtube.com/watch?v=29LLRKIL_TI	
- [ ] R: A language that focuses on statisical analysis, but it has lost some important in Machine Learning in favor of Python.
- [ ] Swift
- [ ] Ruby
- [ ] Julia: A new scientific general purpose language.
- [ ] JavaScript
	
### Web Programming

### Learning Linux


