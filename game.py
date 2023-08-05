import tkinter
import time

def main():
    summary()

def summary():
    print("チュートリアルを開始します。")
    tutb = True

    while tutb == True:
        print("Kキーを押してください。")
        tut = input()
        if(tut == "k"):
            print("you died.")

            for i in range(0, 3, 1):
                time.sleep(1)
                print(".")
            print("冗談だよ。君はJキーを押すべきだった。")
        
        if(tut == "j"):
            tutb =False

    print("皆が親切だとは思わないことだね。")
    print("じゃあチュートリアルを始めるよ。")


if __name__ == "__main__":
    main()