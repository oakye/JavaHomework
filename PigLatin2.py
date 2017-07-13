#!/usr/bin/env python
# Student: Liz K------
#
# Module 8, part 1: Convert a sentence typed in by the user to pig latin. 
# Pig Latin has two rules:
# (1) If a word begins with a consonant,
# all consonants before the first vowel are moved to the end of the word and
# the letters "ay" are then added to the end. e.g. "coin" becomes "oincay" and "flute" becomes "uteflay".
#
# (2) If a word begins with a vowel then
# "yay" is added to the end. e.g."egg" becomes "eggyay" and "oak" becomes "oakyay".

# Define a list of vowels
vowels = ["a", "e", "i", "o", "u"]

# Define a function that translates a word into Pig Latin
# If it begins with a vowel, add "yay" to the word
# If it beings with a consonant, all consonants before the first vowel are moved to the end of the word
def textconvert(word):
	firstletter = word[0]
	if firstletter.lower() in vowels: 
		return word + "yay"
		print(word)
	else:
		while firstletter.lower() not in vowels:
			word = word[1:] + word[0]
		return word + "ay"
		print(word)

# Define a function that translates a sentence into Pig Latin
# Take a user-inputted sentence and split it into an array at each space between words
# Re-build the sentence using Pig Latin words
def sentenceconvert(sentence):
	wordlist = sentence.split(" ")
	pigsentence = ""
	for i in wordlist:
		print(i) 			# this is used to test where my program was getting stuck
		print(wordlist)		# testing to see where my program got stuck
		pigsentence += (textconvert(i) + " ")
		print(pigsentence) 	# used to see if the code gets this far
	return pigsentence

# Get a sentence input from a user

mysentence = input("Type in a sentence you want converted into Pig Latin. Don't use any punctuation.\n")

sentenceconvert(mysentence)




