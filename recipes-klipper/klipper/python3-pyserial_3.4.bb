SUMMARY = "pyserial"
HOMEPAGE = "https://github.com/pyserial/pyserial"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PV = "3.4"
PYPI_PACKAGE = "pyserial"
PYPI_SRC_URI = "https://files.pythonhosted.org/packages/cc/74/11b04703ec416717b247d789103277269d567db575d2fd88f25d9767fe3d/pyserial-3.4.tar.gz"
SRC_URI[md5sum] = "ed6183b15519a0ae96675e9c3330c69b"

RPROVIDES:klipper += "python3-pyserial"

inherit pypi setuptools3
