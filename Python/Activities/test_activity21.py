import pytest


def test_Add():
    num1 = 20
    num2 = 40
    val = num1 + num2

    assert val == 60


def test_Sub():
    num1 = 35
    num2 = 15
    sub = num1 - num2

    assert sub == 20


def test_multiplication():
    num1 = 4
    num2 = 25

    prod = num1 * num2

    assert prod == 100


def test_division():
    num1 = 100
    num2 = 25

    quot = num1 / num2

    assert quot == 4
