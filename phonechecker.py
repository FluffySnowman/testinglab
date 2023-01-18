import phonenumbers
from phonenumbers import timezone
from phonenumbers import carrier

phone_number = input("Enter phone number: ")

ro_number = phonenumbers.parse(phone_number)
print(carrier.name_for_number(ro_number, "en"))

""" print("Country code:", phone_number.country_code)
print("National number:", phone_number.national_number)
print("E164 format:", phonenumbers.format_number(phone_number, phonenumbers.PhoneNumberFormat.E164))
if phonenumbers.is_valid_number(phone_number):
    print("The phone number exists yay")
else:
    print("The phone number doesn't exist you dumb fuck")

"""

print(timezone.time_zones_for_number(ro_number))

