import unittest

from lessons.counting_elements.max_counters import solution


class TestMaxCounters(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution(5, [3, 4, 4, 6, 1, 4, 4]), [3, 2, 2, 4, 2])


if __name__ == '__main__':
    unittest.main()
