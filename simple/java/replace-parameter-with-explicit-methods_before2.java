void setValue(String name, int value) {
  switch (name) {
    case "height":
    height = value;
    break;
  case "width":
    width = value;
  }
  Assert.shouldNeverReachHere();
}