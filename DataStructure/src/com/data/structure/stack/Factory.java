/*package com.data.structure.stack;

class Factory {
	
	enum ValidatorType {
		INT {
			public Validator create() {
				return new IntValidator();
			}
		},
		LOOKUPVALUE {
			public Validator create() {
				return new LookupValueValidator();
			}
		},
		DATE {
			public Validator create() {
				return new DateValidator();
			}
		};
		public Validator create() {
			return null;
		}
	}

	public Validator newInstance(ValidatorType validatorType) {
		return validatorType.create();
	}

}
*/