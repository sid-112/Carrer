from manim import *

class Pith(Scene):
    def construct(self):
        
        sq = Square(side_length=3, fill_color = PINK, stroke_color= BLUE, fill_opacity=0.80)

        self.play(Create(sq), run_time = 3)
        self.wait()