import unittest

from lessons.prefix_sums.genomic_range_query import solution


class TestGenomicRangeQuery(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution('CAGCCTA', [2, 5, 0], [4, 5, 6]), [2, 4, 1])
        self.assertEqual(solution('A', [0], [0]),                   [1])
        self.assertEqual(solution('GT', [0, 0, 1], [0, 1, 1]),      [3, 3, 4])


if __name__ == '__main__':
    unittest.main()
