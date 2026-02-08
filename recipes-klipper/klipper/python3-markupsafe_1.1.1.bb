SUMMARY = "MarkupSafe"
HOMEPAGE = "https://palletsprojects.com/p/markupsafe/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RPROVIDES:klipper += "python3-markupsafe"

PV = "1.1.1"
PYPI_PACKAGE = "MarkupSafe"
PYPI_SRC_URI = "https://files.pythonhosted.org/packages/b9/2e/64db92e53b86efccfaea71321f597fa2e1b2bd3853d8ce658568f7a13094/MarkupSafe-1.1.1.tar.gz"
SRC_URI[md5sum] = "43fd756864fe42063068e092e220c57b"

inherit pypi setuptools3
