#!/usr/bin/env python
# -*- coding: utf-8 -*-

import os
import sys

from setuptools import setup, find_packages


requirements = [
]

test_requirements = [
]

setup(
    name='codility',
    version='0.1.0',
    packages=find_packages('src/main/python', exclude=["*.tests''", "*.tests.*", "tests.*", "tests"]),
    package_dir={'':'src/main/python'},
    include_package_data=False,
    install_requires=requirements,

    author='Jerry Kiely',
    author_email='jerry@cowboysmall.com',
    description='codility',
    keywords='codility',
    url='https://github.com/cowboysmall/codility',

    zip_safe=False,
    classifiers=[
        'Development Status :: 2 - Pre-Alpha',
        'Intended Audience :: Developers',
        'Natural Language :: English',
        "Programming Language :: Python :: 2",
        'Programming Language :: Python :: 2.7',
        'Programming Language :: Python :: 3',
        'Programming Language :: Python :: 3.7',
    ],

    test_suite='tests',
    tests_require=test_requirements
)
