#!/usr/bin/env python
# Student: Liz ---------
# Module 7 part 1: Have the LED spell out "Hello World" in Morse code.


import RPi.GPIO as GPIO
import time
GPIO.setmode(GPIO.BOARD)
GPIO.setup(11, GPIO.OUT)

# define the short & long Morse signals, as well as a pause for use between words

def short():
    GPIO.output(11, True)
    time.sleep(1)
    GPIO.output(11, False)
    time.sleep(1)

def long():
    GPIO.output(11, True)
    time.sleep(3)
    GPIO.output(11, False)
    time.sleep(1)

def pause():
    GPIO.output(11, False)
    time.sleep(3)

# then define each letter, and its Morse code equivalent
# add a short pause after each letter has been signaled, so one knows
# that the specific letter's Morse equivalent is complete

def letterh():
    for x in range(4):
        short()
    time.sleep(1)

def lettere():
    short()
    time.sleep(1)


def letterl():
    short()
    long()
    short()
    short()
    time.sleep(1)


def lettero():
    for x in range(3):
        long()
    time.sleep(1)

def letterw():
    short()
    long()
    long()
    time.sleep(1)

def letterr():
    short()
    long()
    short()
    time.sleep(1)

def letterd():
    long()
    short()
    short()
    time.sleep(1)
    
# execute this loop once and only once


letterh()
lettere()
letterl()
letterl()
lettero()
pause()
letterw()
lettero()
letterr()
letterl()
letterd()

    
    
