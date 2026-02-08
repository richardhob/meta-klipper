# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING.RUNTIME
#   contrib/unicode/unicode-license.txt
#   gcc/ada/doc/share/copyright.tex
#   gcc/ada/doc/share/gnu_free_documentation_license.rst
#   gcc/m2/COPYING.FDL
#   gcc/m2/COPYING.RUNTIME
#   gcc/m2/COPYING3
#   gcc/m2/images/LICENSE.IMG
#   gcc/rust/checks/errors/borrowck/ffi-polonius/vendor/datafrog/LICENSE-APACHE
#   gcc/rust/checks/errors/borrowck/ffi-polonius/vendor/log/LICENSE-APACHE
#   gcc/rust/checks/errors/borrowck/ffi-polonius/vendor/rustc-hash/LICENSE-APACHE
#   gcc/testsuite/gcc.dg/vect/tsvc/license.txt
#   libffi/LICENSE
#   libffi/LICENSE-BUILDTOOLS
#   libgcobol/LICENSE
#   libgo/go/golang.org/x/xerrors/LICENSE
#   libgrust/libformat_parser/vendor/unicode-xid/COPYRIGHT
#   libgrust/libformat_parser/vendor/unicode-xid/LICENSE-APACHE
#   libsanitizer/LICENSE.TXT
#   libstdc++-v3/include/pstl/LICENSE.txt
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.

# From layers/openembedded-core/meta/conf/distro/include/security_flags.inc
#
# This _will_ come up again ... glibc has some here, same with gcc runtime?
SECURITY_STRINGFORMAT:pn-avr-gcc = ""
SECURITY_CFLAGS:pn-avr-gcc = ""

FILESEXTRAPATHS =. "${FILE_DIRNAME}/gcc-patches:"

LICENSE = "Apache-2.0 & BSD-3-Clause & BSL-1.0 & bzip2-1.0.6 & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only & LGPL-3.0-only & MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552 \
                    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
                    file://COPYING.RUNTIME;md5=fe60d87048567d4fe8c8a0ed2448bcc8 \
                    file://COPYING3;md5=d32239bcb673463ab874e80d47fae504 \
                    file://COPYING3.LIB;md5=6a6a8e020838b23406c81b19c1d46df6 \
                    file://contrib/unicode/unicode-license.txt;md5=8b5fa928c1da8636733a0a76a2da5bc8 \
                    file://gcc/COPYING;md5=59530bdf33659b29e73d4adb9f9f6552 \
                    file://gcc/COPYING.LIB;md5=a916467b91076e631dd8edb7424769c7 \
                    file://gcc/COPYING3;md5=d32239bcb673463ab874e80d47fae504 \
                    file://gcc/COPYING3.LIB;md5=6a6a8e020838b23406c81b19c1d46df6 \
                    file://gcc/ada/doc/share/copyright.tex;md5=c7da61a05156d50b4888cdfaae4241d0 \
                    file://gcc/ada/doc/share/gnu_free_documentation_license.rst;md5=0a025bfec2a94c0fcd11a19d18f6c0c5 \
                    file://gcc/d/dmd/boostlicense.txt;md5=e4224ccaecb14d942c71d31bef20d78c \
                    file://gcc/go/gofrontend/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://gcc/m2/COPYING.FDL;md5=890758104e7697865dd110259fee0af5 \
                    file://gcc/m2/COPYING.RUNTIME;md5=b417a4bd52371186803e70c49d24764d \
                    file://gcc/m2/COPYING3;md5=8f0e2cd40e05189ec81232da84bd6e1a \
                    file://gcc/m2/COPYING3.LIB;md5=6a6a8e020838b23406c81b19c1d46df6 \
                    file://gcc/m2/images/LICENSE.IMG;md5=4ca73b6d6c8c5ec77b98814115959b79 \
                    file://gcc/rust/checks/errors/borrowck/ffi-polonius/vendor/datafrog/LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
                    file://gcc/rust/checks/errors/borrowck/ffi-polonius/vendor/datafrog/LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
                    file://gcc/rust/checks/errors/borrowck/ffi-polonius/vendor/log/LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
                    file://gcc/rust/checks/errors/borrowck/ffi-polonius/vendor/log/LICENSE-MIT;md5=362255802eb5aa87810d12ddf3cfedb4 \
                    file://gcc/rust/checks/errors/borrowck/ffi-polonius/vendor/rustc-hash/LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
                    file://gcc/rust/checks/errors/borrowck/ffi-polonius/vendor/rustc-hash/LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
                    file://gcc/testsuite/gcc.dg/params/LICENSE;md5=ddeb76cd34e791893c0f539fdab879bb \
                    file://gcc/testsuite/gcc.dg/vect/tsvc/license.txt;md5=e89cc050a04f95cc194e9469aa72808f \
                    file://include/COPYING;md5=59530bdf33659b29e73d4adb9f9f6552 \
                    file://include/COPYING3;md5=d32239bcb673463ab874e80d47fae504 \
                    file://libcody/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://libffi/LICENSE;md5=679b5c9bdc79a2b93ee574e193e7a7bc \
                    file://libffi/LICENSE-BUILDTOOLS;md5=631bc8750a749106cf625001c1d6efb0 \
                    file://libgcobol/LICENSE;md5=b227feb8ac8df349788743a8ade3e840 \
                    file://libgo/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://libgo/go/golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://libgo/go/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://libgo/go/golang.org/x/tools/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://libgo/go/golang.org/x/xerrors/LICENSE;md5=a413d6b3884e141783f23d00d5838777 \
                    file://libgrust/libformat_parser/vendor/libc/LICENSE-APACHE;md5=22a53954e4e0ec258dfce4391e905dac \
                    file://libgrust/libformat_parser/vendor/libc/LICENSE-MIT;md5=75e317e57cfa6ba43d97c6ed4504e2b0 \
                    file://libgrust/libformat_parser/vendor/unicode-xid/COPYRIGHT;md5=37ace7095226db9416857c9ca8d1b090 \
                    file://libgrust/libformat_parser/vendor/unicode-xid/LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
                    file://libgrust/libformat_parser/vendor/unicode-xid/LICENSE-MIT;md5=615cc94ba6f721c4ed3d6988605e85ca \
                    file://libiberty/COPYING.LIB;md5=a916467b91076e631dd8edb7424769c7 \
                    file://libphobos/libdruntime/LICENSE.txt;md5=e4224ccaecb14d942c71d31bef20d78c \
                    file://libphobos/src/LICENSE_1_0.txt;md5=e4224ccaecb14d942c71d31bef20d78c \
                    file://libquadmath/COPYING.LIB;md5=a916467b91076e631dd8edb7424769c7 \
                    file://libsanitizer/LICENSE.TXT;md5=0249c37748936faf5b1efd5789587909 \
                    file://libstdc++-v3/include/pstl/LICENSE.txt;md5=75cfb36aeb3ed8672bb4e2957272203c \
                    file://zlib/contrib/dotzlib/LICENSE_1_0.txt;md5=81543b22c36f10d20ac9712f8d80ef8d"

base_url = 'http://gcc.gnu.org/pub/gcc/infrastructure/'
SRC_URI = "https://mirrors.ibiblio.org/gnu/gcc/gcc-${PV}/gcc-${PV}.tar.gz;name=gcc \
           ${base_url}gmp-6.2.1.tar.bz2;name=gmp;subdir=gcc-${PV} \
           ${base_url}mpfr-4.1.0.tar.bz2;name=mpfr;subdir=gcc-${PV} \
           ${base_url}mpc-1.2.1.tar.gz;name=mpc;subdir=gcc-${PV} \
           ${base_url}isl-0.24.tar.bz2;name=isl;subdir=gcc-${PV} \
           file://0001-gcc-4.3.1-ARCH_FLAGS_FOR_TARGET.patch \
           file://0002-gcc-poison-system-directories.patch \
           file://0003-64-bit-multilib-hack.patch \
           file://0004-Pass-CXXFLAGS_FOR_BUILD-in-a-couple-of-places-to-avo.patch \
           file://0005-Use-the-defaults.h-in-B-instead-of-S-and-t-oe-in-B.patch \
           file://0006-cpp-honor-sysroot.patch \
           file://0007-Define-GLIBC_DYNAMIC_LINKER-and-UCLIBC_DYNAMIC_LINKE.patch \
           file://0008-libtool.patch \
           file://0009-gcc-armv4-pass-fix-v4bx-to-linker-to-support-EABI.patch \
           file://0010-Use-the-multilib-config-files-from-B-instead-of-usin.patch \
           file://0011-aarch64-Fix-include-paths-when-S-B.patch \
           file://0012-Avoid-using-libdir-from-.la-which-usually-points-to-.patch \
           file://0013-Ensure-target-gcc-headers-can-be-included.patch \
           file://0014-Don-t-search-host-directory-during-relink-if-inst_pr.patch \
           file://0015-libcc1-fix-libcc1-s-install-path-and-rpath.patch \
           file://0016-handle-sysroot-support-for-nativesdk-gcc.patch \
           file://0017-Search-target-sysroot-gcc-version-specific-dirs-with.patch \
           file://0018-Add-ssp_nonshared-to-link-commandline-for-musl-targe.patch \
           file://0019-Re-introduce-spe-commandline-options.patch \
           file://0020-libgcc_s-Use-alias-for-__cpu_indicator_init-instead-.patch \
           file://0021-gentypes-genmodes-Do-not-use-__LINE__-for-maintainin.patch \
           file://0022-libatomic-Do-not-enforce-march-on-aarch64.patch \
           file://0023-Fix-install-path-of-linux64.h.patch \
           file://0024-Avoid-hardcoded-build-paths-into-ppc-libgcc.patch \
           file://0025-gcc-testsuite-tweaks-for-mips-OE.patch \
           file://0026-fix-pr90579-testcases.patch \
           file://0027-gcc15-pr122394.patch \
           file://0001-mapper-localhost-might-not-be-known.patch \
"

SRC_URI[gcc.sha256sum] = "7294d65cc1a0558cb815af0ca8c7763d86f7a31199794ede3f630c0d1b0a5723"
SRC_URI[gmp.sha256sum] = "eae9326beb4158c386e39a356818031bd28f3124cf915f8c5b1dc4c7a36b4d7c"
SRC_URI[mpfr.sha256sum] = "feced2d430dd5a97805fa289fed3fc8ff2b094c02d05287fd6133e7f1f0ec926"
SRC_URI[mpc.sha256sum] = "17503d2c395dfcf106b622dc142683c1199431d095367c6aacba6eec30340459"
SRC_URI[isl.sha256sum] = "fcf78dd9656c10eb8cf9fbd5f59a0b6b01386205fe1934b3b287a0a1898145c0"

S = "${UNPACKDIR}/gcc-${PV}"

# https://gcc.gnu.org/install/prerequisites.html 
DEPENDS = "m4-native flex-native bison-native gettext-native"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools gettext pkgconfig texinfo chrpath

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = "\
    --target=avr \
    --enable-languages=c,c++ \
    --disable-nls \
    --disable-libssp \
    --disable-libada \
    --with-dwarf2 \
    --disable-shared \
    --enable-static \
    --enable-mingw-wildcard \
    --enable-plugin \
    --with-gnu-as \
    --with-gnu-ld \
    --without-zstd \
"

FILES:${PN} = "\
    ${bindir}/avr-gcc* \
    ${bindir}/avr-lto* \
    ${libexecdir}/gcc/avr/${P}/collect2* \
    ${libexecdir}/gcc/avr/${P}/g++-mapper-server \
    ${libexecdir}/gcc/avr/${P}/lto* \
    ${gcclibdir}/avr/${P}/*.o \
    ${gcclibdir}/avr/${P}/specs \
    ${gcclibdir}/avr/${P}/include \
    ${gcclibdir}/avr/${P}/include-fixed \
    ${libdir}/bfd-plugins/*.so \
"

do_my_pre_configure() {
    cd ${S}
    ln -s "gmp-6.2.1" "gmp"
    ln -s "mpfr-4.1.0" "mpfr"
    ln -s "mpc-1.2.1" "mpc"
    ln -s "isl-0.24" "isl"
}

addtask do_my_pre_configure before do_configure after do_fetch

do_configure() {
	(cd ${S} && gnu-configize)
	oe_runconf
}

do_install () {
	oe_runmake 'DESTDIR=${D}' install-strip
}
