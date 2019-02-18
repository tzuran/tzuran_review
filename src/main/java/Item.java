package main.java;

public final class Item 
{
        public int key;
        //constructor
        public Item(int keyValue) 
        { 
                key = keyValue;
        }
        // further components and methods
        public int getKey()
        {
        	return this.key;
        }
        
        public void setKey(int value)
        {
        	this.key = value;
        }
}