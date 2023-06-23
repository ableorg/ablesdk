"""
    Able API

    SDK for building integrations with Able.  # noqa: E501

    The version of the OpenAPI document: 1.20230623221606
    Contact: support@able.ai
    Generated by: https://openapi-generator.tech
"""


from setuptools import setup, find_packages  # noqa: H301

NAME = "Able Python SDK"
VERSION = "1.0.0"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
  "urllib3 >= 1.25.3",
  "python-dateutil",
]

setup(
    name=NAME,
    version=VERSION,
    description="Able API",
    author="Able technical support",
    author_email="support@able.ai",
    url="https://github.com/ableorg/ablesdk/tree/main/lowlevel/v1/python",
    keywords=["OpenAPI", "OpenAPI-Generator", "Able API"],
    python_requires=">=3.6",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="MIT",
    long_description="""\
    SDK for building integrations with Able.  # noqa: E501
    """
)
