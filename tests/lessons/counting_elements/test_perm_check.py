import unittest

from lessons.counting_elements.perm_check import solution


class TestPermCheck(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution([4, 1, 3, 2]), 1)
        self.assertEqual(solution([4, 1, 3]),    0)


if __name__ == '__main__':
    unittest.main()
