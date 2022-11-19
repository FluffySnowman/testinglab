#create a for loop to print number from 1 ot 10

for i in range(1,11):
    print(i)


#create a gui with 10 boxes using tkinter

from tkinter import *

root = Tk()
root.title("GUI")
root.geometry("400x300+300+300")

for i in range(1,11):
    Label(root, text="Label " + str(i)).grid(row=i, column=0, padx=5, pady=5)
    
root.mainloop()

