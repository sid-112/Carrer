try:
    from manim import *
except:
    print(0)

try:
    class Basics(Scene):
        def construct(self):
            circle = Circle()
            self.add(circle)
except Exception as e:
    print("Print Error found")