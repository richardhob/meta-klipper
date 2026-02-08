# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "BSL-1.0 & GPL-2.0-only & GPL-3.0-only & LGPL-2.0-only & LGPL-2.1-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552 \
                    file://COPYING.LIB;md5=9f604d8a4f8e74f4f5140845a21b6674 \
                    file://COPYING3;md5=d32239bcb673463ab874e80d47fae504 \
                    file://COPYING3.LIB;md5=6a6a8e020838b23406c81b19c1d46df6 \
                    file://bfd/COPYING;md5=d32239bcb673463ab874e80d47fae504 \
                    file://gas/COPYING;md5=d32239bcb673463ab874e80d47fae504 \
                    file://include/COPYING;md5=59530bdf33659b29e73d4adb9f9f6552 \
                    file://include/COPYING3;md5=d32239bcb673463ab874e80d47fae504 \
                    file://libiberty/COPYING.LIB;md5=a916467b91076e631dd8edb7424769c7 \
                    file://zlib/contrib/dotzlib/LICENSE_1_0.txt;md5=81543b22c36f10d20ac9712f8d80ef8d"

SRC_URI = "https://mirror.cs.odu.edu/gnu/binutils/binutils-${PV}.tar.xz \
           file://config.guess \
           file://config.sub \
           "
SRC_URI[sha256sum] = "c50c0e7f9cb188980e2cc97e4537626b1672441815587f1eab69d2a1bfbef5d2"

S = "${UNPACKDIR}/binutils-${PV}"

# NOTE: the following prog dependencies are unknown, ignoring: lex gm4 expect runtest gnum4 yacc byacc
DEPENDS = "flex-native bison-native gnu-config-native autoconf-native"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools gettext pkgconfig texinfo chrpath

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = "--target=avr --disable-nls --disable-werror"

FILES:${PN} = "${bindir}/avr-* \
	${prefix}/avr/bin/* \
"

do_configure () {
	(cd ${S} && gnu-configize)

	oe_runconf
}

do_install () {
	autotools_do_install

	# We don't really need these, so we'll remove them...
	rm -rf ${D}/${prefix}/avr/lib/ldscripts
	rmdir ${D}/${prefix}/avr/lib

	rm -rf ${D}/usr/lib
}
