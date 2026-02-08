SUMMARY = "Greenlet"
HOMEPAGE = "https://greenlet.readthedocs.io/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PV = "3.1.1"
PYPI_PACKAGE = "greenlet"
PYPI_SRC_URI = "https://files.pythonhosted.org/packages/2f/ff/df5fede753cc10f6a5be0931204ea30c35fa2f2ea7a35b25bdaf4fe40e46/greenlet-3.1.1.tar.gz"
SRC_URI[md5sum] = "13a71396abdf249280fa25d258acf435"

RPROVIDES:klipper += "python3-greenlet"

inherit pypi python_setuptools_build_meta
