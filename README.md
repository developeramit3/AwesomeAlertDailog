"# AwesomeAlertDialog" 

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
  dependencies {
	        implementation 'com.github.developeramit3:AwesomeAlertDailog:Tag'
	}
	// How To use 
	 new AwesomeDialogBuilder(VerificationPhone.this)
                            .setTitle("Hello, This is title ")
                            .setSubtitle(message)
                            .setBoldPositiveLabel(true)
                            .setCancelable(false)
                            .setPositiveListener("Yes",new mDialogClickListener() {
                                @Override
                                public void onClick(AwesomeDialog dialog) {
                                    dialog.dismiss();
                                    FragTrans(new FragmentOtp());
                                }
                            })
                            .setNegativeListener("No", new mDialogClickListener() {
                                @Override
                                public void onClick(AwesomeDialog dialog) {
                                    dialog.dismiss();
                                }
                            })
                            .build().show();
"# AwesomeAlertDialog" 
