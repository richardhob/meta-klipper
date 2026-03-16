SUMMARY = "Foreign Function Interface for Python calling C code."
HOMEPAGE = "https://github.com/python-cffi/cffi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PV = "2.0.0"
PYPI_PACKAGE = "cffi"
PYPI_SRC_URI = "https://files.pythonhosted.org/packages/eb/56/b1ba7935a17738ae8453301356628e8147c79dbb825bcbc73dc7401f9846/cffi-2.0.0.tar.gz"
SRC_URI[md5sum] = "5e897f6251e614f6bd128a73e81801a4"

DEPENDS += "libffi"
RPROVIDES:klipper += "python3-cffi"

SRC_URI += "file://0001-Use-sysroot-dir-for-includes.patch"

inherit pypi python_setuptools_build_meta
