import unittest

from lessons.counting_elements.missing_integer import solution


class TestMissingInteger(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution([1, 3, 6, 4, 1, 2]), 5)


if __name__ == '__main__':
    unittest.main()
