from manim import *

class test(Scene):
    def construct(self):
        circ = Circle(radius=2.4, color=PINK)
        self.play(Create(circ), run_time=3)
        self.wait()

