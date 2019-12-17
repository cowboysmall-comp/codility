import unittest

from lessons.time_complexity.tape_equilibrium import solution


class TestTapeEquilibrium(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution([3, 1, 2, 4, 3]), 1)


if __name__ == '__main__':
    unittest.main()
