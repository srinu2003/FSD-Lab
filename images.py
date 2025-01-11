from pypdf import PdfReader
from pypdf.generic import DictionaryObject, ArrayObject
from IPython.display import display, Image
from PIL import Image as PILImage
from typing import List
from PIL.ImageFile import ImageFile
import io

resume_file_path = 'Report.pdf'
reader = PdfReader(resume_file_path)

for page in reader.pages:
    images = page.images
    img_list: List[ImageFile] = []
    for image in images:
        img = PILImage.open(io.BytesIO(image.data))
        display(Image(data=image.data))
        # add image to list
        img_list.append(PILImage.open(io.BytesIO(image.data)))
    # save images in img_list into an images/ folder
    for i, img in enumerate(img_list):
        img.save(f'images/img_{i}.png')
        
        display(img)
