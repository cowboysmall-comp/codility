import unittest

from lessons.time_complexity.perm_missing_elem import solution


class TestPermMissingElem(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution([2, 3, 1, 5]), 4)


if __name__ == '__main__':
    unittest.main()
