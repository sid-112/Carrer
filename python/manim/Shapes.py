from manim import *

class FirstExample(Scene):
    def construct(self):
        blue_circle = Circle(color=BLUE_C, fill_opacity=0.7)
        green_square = Square(color=GREEN_A, fill_opacity=0.7)
        green_square.next_to(blue_circle, RIGHT)
        self.add(blue_circle, green_square)
