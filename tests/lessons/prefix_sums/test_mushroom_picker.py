import unittest

from lessons.prefix_sums.mushroom_picker import solution


class TestMushroomPicker(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution([2, 3, 7, 5, 1, 3, 9], 4, 6), 25)


if __name__ == '__main__':
    unittest.main()
