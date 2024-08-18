using System;
using System.Collections.Generic;
using System.Linq;
using System.Resources;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Hello World
            Console.WriteLine("Hello World");
            //VAriables
            int sid = 7;
            bool b = true;
            float f;
            char c = 'r';
            double bo = 3.14;
            String s = "Siddharth";
            Console.WriteLine(sid);
            Console.WriteLine(b);
            Console.WriteLine(bo);
            Console.WriteLine(c);
            //Inoput
            //String inp = Console.ReadLine();
            //Console.WriteLine(inp);
            int a = 9;
            int d = a;
            Console.WriteLine(d);
            Console.WriteLine(a);

            //Opretors
            Console.WriteLine(4+ 5);
            Console.WriteLine(5-4);
            Console.WriteLine(5*4);
            Console.WriteLine(20/4);
            Console.WriteLine(20 % 2);

            //Interpolation
            String gh = "Sid";
            String hg = "dj";
            String name = $"My Full name is {gh} {hg}";
            Console.WriteLine(name);

            //If else
            if (4 < 3)
            {
                Console.WriteLine("Sid");
            }

            else if (5 == 6)
            {
                Console.WriteLine("Dj");
            }

            else
            {
                Console.WriteLine("Rupa");
            }

            //for loop
            for (int i = 0; i <=10; i++)
            {
                Console.WriteLine(i);
            }

            //While loop
            int j = 0;
            while(j <= 10)
            {
                j++;
                if (j == 3)
                {
                    continue;
                }

                if (j == 7)
                {
                    break;
                }
                else {
                    continue;
                }
            }
            Console.ReadLine();
        }
    }
}
