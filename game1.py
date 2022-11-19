import tkinter as tk
from tkinter import ttk
from tkinter import colorchooser
from tkinter import messagebox

class Game(tk.Frame):
    def __init__(self, parent):
        tk.Frame.__init__(self, parent)
        self.parent = parent
        self.initUI()
        self.colour = 'black'

    def initUI(self):
        self.parent.title("Game")
        self.pack(fill=tk.BOTH, expand=1)

        self.columnconfigure(1, weight=1)
        self.columnconfigure(3, pad=7)
        self.rowconfigure(3, weight=1)
        self.rowconfigure(5, pad=7)

        self.colourButton = ttk.Button(self, text='Colour', command=self.chooseColour)
        self.colourButton.grid(row=1, column=0, padx=5, sticky=tk.W)

        self.canvas = tk.Canvas(self, bg='white')
        self.canvas.grid(row=1, column=1, columnspan=2, rowspan=4, padx=5, sticky=tk.E+tk.W+tk.S+tk.N)

        self.clearButton = ttk.Button(self, text='Clear', command=self.clearCanvas)
        self.clearButton.grid(row=5, column=1, pady=5, sticky=tk.W)

        self.quitButton = ttk.Button(self, text='Quit', command=self.parent.quit)
        self.quitButton.grid(row=5, column=2, pady=5, sticky=tk.E)

        self.canvas.bind('<B1-Motion>', self.paint)

    def chooseColour(self):
        self.colour = colorchooser.askcolor()[1]

    def clearCanvas(self):
        self.canvas.delete('all')

    def paint(self, event):
        x1, y1 = (event.x - 1), (event.y - 1)
        x2, y2 = (event.x + 1), (event.y + 1)
        self.canvas.create_oval(x1, y1, x2, y2, fill=self.colour, outline=self.colour)









def main():
    root = tk.Tk()
    root.geometry("400x300+300+300")
    app = Game(root)
    root.mainloop()

if __name__ == '__main__':
    main()

