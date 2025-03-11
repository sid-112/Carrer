import streamlit as st


st.title('Info')
y = st.text_input("Name")
x = st.text_input('Email')

st.write(f'Your Email and Name are {x} and {y}')

but = st.button('Submit')