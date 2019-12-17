import unittest

from lessons.time_complexity.frog_jmp import solution


class TestFrogJmp(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution(10, 85, 30), 3)


if __name__ == '__main__':
    unittest.main()
