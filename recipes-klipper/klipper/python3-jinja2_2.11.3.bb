SUMMARY = "Jinja2"
HOMEPAGE = "https://github.com/pallets/jinja/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PV = "2.11.3"
PYPI_PACKAGE = "Jinja2"
PYPI_SRC_URI = "https://files.pythonhosted.org/packages/4f/e7/65300e6b32e69768ded990494809106f87da1d436418d5f1367ed3966fd7/Jinja2-2.11.3.tar.gz"
SRC_URI[md5sum] = "231dc00d34afb2672c497713fa9cdaaa"

RPROVIDES:klipper += "python3-jinja2"

inherit pypi setuptools3
