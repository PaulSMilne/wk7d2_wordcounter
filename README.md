A project to make a simple mobile app of a word counter - to type in a string of words and say back how many words are in.

I spent over an hour at Codeclan setting up some of the files and doing a CountWord java class that does the basic calculations. I then created a Word Counter class file to run the app. I've been checking the files in the EightBall app to work out how they all fit together and where to make changes for the different app.

It has taken me less than two hours to get the app working after I had my dinner. I basically went through the eight ball code line by line, trying to understand what was going on best as I could, getting all the various files to talk to each other. 

The WordCounter java file with all the nested methods was particularly tricky, especially threading back into the one activity what had been split into two activities in the eight ball app. 

My final hurdle was trying run it and the app failing and quitting. I was able to use the debugging tools to narrow down the problem. It was getting the text, and it was correctly running the word count, but was failing at the very last couple of lines. I was trying to use the integer by itself as an int type to return as the answer. As soon as I incoporated the integer into a string it worked.

