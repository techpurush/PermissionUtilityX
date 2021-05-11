# PermissionUtilityX

How to use:

1)Add storage permission to your manifest.

1)Add this at project level:

maven { url 'https://jitpack.io' }

3)Add this at app level:

implementation 'com.github.techpurush:PermissionUtilityX:Tag'

4)Sample code implementation:


           PermissionUtilsX.Builder(getContext(), Manifest.permission.READ_EXTERNAL_STORAGE)
                .requestWithListener(new PermissionGrantedOrDeniedInterface() {
                    @Override
                    public void granted(String... permissions) {
                        Toast.makeText(MainActivity.this, "granted", Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void denied(String... permissions) {
                        Toast.makeText(MainActivity.this, "denied", Toast.LENGTH_SHORT).show();

                    }
                });
